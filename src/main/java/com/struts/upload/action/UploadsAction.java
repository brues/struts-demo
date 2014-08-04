package com.struts.upload.action;

import com.struts.base.action.BaseAction;

import java.io.*;

/**
 * Created by guoyibin on 8/4/14.
 *
 *
 * 文件上传
 */
public class UploadsAction extends BaseAction {

    private File upload;
    private String fileName;
    private String uploadContentType;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }



    /**
     * 单文件上传
     *
     * */
    public String execute() throws Exception{
        InputStream is = new FileInputStream(upload);
        OutputStream os = new FileOutputStream("upload");
        byte buffer[] = new byte[8192];
        int count = 0;
        while((count = is.read(buffer))>0){
            os.write(buffer,0,count);
        }
        os.close();
        is.close();
        return SUCCESS;
    }
}
