package Myproject.SpringBoot.Services;

import Myproject.SpringBoot.Models.Worker;
import Myproject.SpringBoot.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServices {

    @Autowired
    private WorkerRepository workerrepository;

    public Worker createworker(Worker data) {

        return workerrepository.save(data);
    }

    public List<Worker> getallworker() {

        return workerrepository.findAll();
    }

    public Worker updateworker(Worker data) {

        return workerrepository.save(data);
    }

    public void deleteWorker(int id) {

        workerrepository.deleteById(id);
    }
}