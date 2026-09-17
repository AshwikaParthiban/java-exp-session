package Myproject.SpringBoot.Controller;

import Myproject.SpringBoot.Models.Worker;
import Myproject.SpringBoot.Services.WorkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worker")
public class WorkerController {

    @Autowired
    private WorkerServices workerServices;
    @GetMapping("/getall")
    ResponseEntity<List<Worker>> getall() {

        return new ResponseEntity<>(
                workerServices.getallworker(),
                HttpStatus.OK
        );
    }

    @PostMapping("/create")
    ResponseEntity<Worker> createworker(@RequestBody Worker body) {

        return new ResponseEntity<>(
                workerServices.createworker(body),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/update")
    ResponseEntity<Worker> updateworker(@RequestBody Worker data) {

        return new ResponseEntity<>(
                workerServices.updateworker(data),
                HttpStatus.ACCEPTED
        );
    }


    @GetMapping("/getbyid/{id}")
    String getbyId(@PathVariable long id) {

        return "Worker with id " + id;
    }

    @GetMapping("/getbyid")
    String getbyIdParam(@RequestParam long i) {

        return "Worker with id " + i;
    }

    @DeleteMapping("/workers/{id}")
    public ResponseEntity<String> deleteWorker(@PathVariable int id) {

        workerServices.deleteWorker(id);

        return new ResponseEntity<>(
                "Worker deleted successfully",
                HttpStatus.OK
        );
    }
}