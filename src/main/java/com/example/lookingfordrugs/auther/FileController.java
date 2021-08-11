package com.example.lookingfordrugs.auther;


import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@RestController
public class FileController {
   @PostMapping(/*value=*/"/uploadFile"/*,consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
   produces = MediaType.APPLICATION_JSON_VALUE*/)
    public void upload(@RequestParam("file")MultipartFile filepart) throws IOException {
       File file=new File("C:\\Users\\Toshiba\\Desktop\\LookingForDrugs\\src\\main\\java\\com\\example\\lookingfordrugs\\Controller\\"+filepart.getOriginalFilename());
       FileUtils.copyInputStreamToFile(filepart.getInputStream(),file);
      // UserDetails
   }
}
