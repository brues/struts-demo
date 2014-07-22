package com.struts.upload.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by guoyibin on 7/22/14.
 *
 */
public class UploadAction {

    private String img;

    public String upload(){
        return "upload";
    }

    /**
     * 文件同步上传例子
     * */
    public String uploadImg() throws Exception{
        FileInputStream fi=new FileInputStream(img);
        BufferedInputStream in=new BufferedInputStream(fi);
        FileOutputStream fo=new FileOutputStream("src/main/webapp/resources/upload/demo.jpg");
        BufferedOutputStream out=new BufferedOutputStream(fo);

        byte[] buf=new byte[1024];
        int len=in.read(buf);//读文件，将读到的内容放入到buf数组中，返回的是读到的长度
        while(len!=-1){
            out.write(buf, 0, len);
            len=in.read(buf);
        }

        out.close();
        fo.close();
        in.close();
        fi.close();
        return "uploadImg";
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
