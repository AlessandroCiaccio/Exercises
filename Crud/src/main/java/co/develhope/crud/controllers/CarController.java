package co.develhope.crud.controllers;

import co.develhope.crud.entities.Car;
import co.develhope.crud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CarController {

    @Autowired CarRepository carRepository;

    @PostMapping(path = "/createonecar")
    public Car createOneCar(@RequestBody Car car) {
        return carRepository.saveAndFlush(car);
    }

    @PostMapping(path = "/createmorecars")
    public List<Car> createMoreCars(@RequestBody List<Car> cars) {
        return carRepository.saveAllAndFlush(cars);
    }

    @GetMapping(path = "/getallcars")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping(path = "/getonecar")
    public Car getOneCarById(@RequestParam Long id) {
        if (carRepository.existsById(id)) {
            return carRepository.getById(id);
        } else {
            return new Car();
        }
    }

    @PutMapping(path = "/modifytype")
    public Car modifyType(@RequestParam Long id, @RequestParam String newType) {
        if (carRepository.existsById(id)) {
            Car newCar = getOneCarById(id);
            newCar.setType(newType);
            return carRepository.saveAndFlush(newCar);
        } else return new Car();
    }
    @DeleteMapping(path="/deleteonecar")
    public Boolean deleteOneCarById(@RequestParam long id){
        if (carRepository.existsById(id)){
            Car deletedCar = carRepository.getById(id);
            carRepository.deleteById(id);
            return true;
        }else return false;
    }
    @DeleteMapping(path="/deletemorecars")
    public void deleteMoreCarsById(@RequestParam List<Long> ids){
        carRepository.deleteAllById(ids);
    }
    @DeleteMapping(path="/deleteallcars")
    public void deleteAllCars(){
        carRepository.deleteAll();
    }
}
