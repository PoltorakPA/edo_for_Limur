package com.education.service;

import java.io.IOException;

/**
 * Interface declare main methods of minio service.
 */
public interface MinioService {

    /**
     * Method delete objects
     * with a last modified time more than 27 day of month.
     */
    void deleteObjects(String objectNumber);


    /**
     * Method check connection to server MinIo with a parameters of admin.
     */
    void checkConnection();

    /**
     * Method upload the file to server MinIo.
     * Variable "objectName" means name of object, uploadibg to the bucket of minio server.
     */
    void uploadOneFile(String objectName) throws IOException;

    /**
     * Method download the file from server MinIo.
     * Variable "objectName" means name of object,
     * downloading from the bucket of minio server
     * to target folder.
     */
    void downloadOneFile(String objectName);
}

