package ru.itpark.news.services;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface FilesService {
  String save(Authentication authentication, MultipartFile multipartFile);

  void writeFileTOResponse(String fileName, HttpServletResponse response);
}
