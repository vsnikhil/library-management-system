package com.db.libmanagementsystem.Controller;

import com.db.libmanagementsystem.Model.Book;
import com.db.libmanagementsystem.Service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class BorrowerController {
    @Autowired
    BorrowerService borrowerService;

}
