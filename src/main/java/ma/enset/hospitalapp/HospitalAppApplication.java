package ma.enset.hospitalapp;

import ma.enset.hospitalapp.entities.Patient;
import ma.enset.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Abderrahmane kalmoun",new Date(),false,42));
            patientRepository.save(new Patient(null,"MOUAD",new Date(),true,98));
            patientRepository.save(new Patient(null,"Yassine",new Date(),true,342));
            patientRepository.save(new Patient(null,"Siham",new Date(),false,123));
        };
    }
}
