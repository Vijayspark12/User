package com.java.user.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.java.user.constants.AppConstant;


@RestController(value = AppConstant.POST_CONTROLLER)
public class Postcontroller {
	@Value("${file.upload-dir}")
	String FILE_DIRECTORY;
	
	@PostMapping("/uploadFile")
	public ResponseEntity<Object>fileUpload( @RequestParam("File") MultipartFile file) throws IOException{
		File myfile = new File(FILE_DIRECTORY+file.getOriginalFilename());
		myfile.createNewFile();
		FileOutputStream fos = new FileOutputStream(myfile);
		fos.write(file.getBytes());
		fos.close();
		return new ResponseEntity<Object>("The file uploaded successfully", HttpStatus.OK);
	}
	
}
