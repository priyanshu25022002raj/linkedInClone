package com.connectWithMe.linkedInProject.uploader_service;

import org.springframework.web.multipart.MultipartFile;

public interface UploaderService {

    String upload(MultipartFile file);

}
