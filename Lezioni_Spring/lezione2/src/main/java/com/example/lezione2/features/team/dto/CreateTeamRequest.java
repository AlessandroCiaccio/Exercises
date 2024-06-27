package com.example.lezione2.features.team.dto;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateTeamRequest {
        private String name;
        private String city;
        private String league;
}
