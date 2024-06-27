package com.exercise.testController;

import com.exercise.testController.controllers.StudentController;
import com.exercise.testController.entities.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.assertj.core.api.Assertions.assertThat;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class StudentControllerTest {
    @Autowired
    private StudentController studentController;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoad() {
        assertThat(studentController).isNotNull();
    }

    private Student createStudent() throws Exception {
        Student student = new Student();
        student.setIsWorking(false);
        student.setName("Pietro");
        student.setSurname("Strano");

        return createStudent(student);
    }

    private Student createStudent(Student student) throws Exception {
        MvcResult result = createStudentRequest(student);
        return objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
    }

    private MvcResult createStudentRequest() throws Exception {
        Student student = new Student();
        student.setIsWorking(false);
        student.setName("Pietro");
        student.setSurname("Strano");

        String studentJSON = objectMapper.writeValueAsString(student);

        return this.mockMvc.perform(post("/v1/createStudent")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJSON)).andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    private MvcResult createStudentRequest(Student student) throws Exception {
        if (student != null) {
            String studentJSON = objectMapper.writeValueAsString(student);

            return this.mockMvc.perform(post("/v1/createStudent")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(studentJSON)).andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();
        } else return null;
    }

    private Student getStudentFromId(Long id) throws Exception {
        MvcResult result = this.mockMvc.perform(get("/v1/getOneStudent/" + id))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        try {
            String studentJSON = result.getResponse().getContentAsString();
            return objectMapper.readValue(studentJSON, Student.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    void createStudentTest() throws Exception {
        Student studentFromResponse = createStudent();
        assertThat(studentFromResponse.getId()).isNotNull();
    }

    @Test
    void getStudentListTest() throws Exception {
        createStudentRequest();
        MvcResult result = this.mockMvc.perform(get("/v1/getAllStudents"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        List<Student> studentsFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);
        System.out.println("The students in database are: " + studentsFromResponse.size());
        assertThat(studentsFromResponse.size()).isNotZero();
    }

    @Test
    void getStudentTest() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        Student studentFromResponse = getStudentFromId(student.getId());
        assertThat(studentFromResponse.getId()).isEqualTo(student.getId());
    }

    @Test
    void changeNameTest() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        String newName = "Luigi";
        student.setName(newName);

        String studentJSON = objectMapper.writeValueAsString(student);

        MvcResult result = this.mockMvc.perform(patch("/v1/changeNameStudent/" + student.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student studentFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);

        //Check student from PUT
        assertThat(studentFromResponse.getId()).isEqualTo(student.getId());
        assertThat(studentFromResponse.getName()).isEqualTo(newName);

        //Get student with Get
        Student studentFromGet = getStudentFromId(student.getId());
        assertThat(studentFromGet.getId()).isEqualTo(student.getId());
        assertThat(studentFromGet.getName()).isEqualTo(newName);

    }

    @Test
    void deleteStudent() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        this.mockMvc.perform(delete("/v1/deleteOneStudent/" + student.getId()))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student studentFromResponseGet = getStudentFromId(student.getId());
        assertThat(studentFromResponseGet).isNull();
    }

    @Test
    void isWorkingStudent() throws Exception {
        Student student = createStudent();
        assertThat(student.getId()).isNotNull();

        MvcResult result = this.mockMvc.perform(patch("/v1/changeIsWorkingStudent/" + student.getId() + "?working=true"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        Student studentFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
        assertThat(studentFromResponse.getId()).isEqualTo(student.getId());
        assertThat(studentFromResponse.getIsWorking()).isEqualTo(true);

        Student studentFromResponseGet = getStudentFromId(student.getId());
        assertThat(studentFromResponseGet.getId()).isEqualTo(student.getId());
        assertThat(studentFromResponseGet.getIsWorking()).isEqualTo(true);
    }
}
