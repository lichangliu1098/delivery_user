package com.cloudcare.cbis.deliveryuser.web;

import com.cloudcare.cbis.deliveryuser.comm.FastDFSClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    private static Logger logger = LoggerFactory.getLogger(UploadController.class);

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "file is Empty()";
        }

        String path = null;
        try {
            path= FastDFSClient.saveFile(file);
        } catch (Exception e) {
            logger.error("upload file failed",e);
        }
        return path;
    }

}
