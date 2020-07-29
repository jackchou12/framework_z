package com.fec.yunmall.projectcore.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 *     desc   : Retrofit文件上传工具类
 */

public class FileUploadUtils {

    /**
     * 把File 转成 MultipartBody.Part
     */
    public static List<MultipartBody.Part> filesToMultipartBodyParts(List<String> filePaths) {
        List<MultipartBody.Part> parts = new ArrayList<>(filePaths.size());
        for (String path : filePaths) {

//            RequestBody.create(MediaType.parse("application/otcet-stream"), file);
            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), new File(compressImage(path)));
           // RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), new File(compressImage(path)));
           // RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), new File(path));

            MultipartBody.Part part = MultipartBody.Part.createFormData("files", System.currentTimeMillis() + "", requestBody);
            parts.add(part);
        }
        return parts;
    }


    public static Map<String, RequestBody> filesToMap(List<String> filePaths) {
        Map<String, RequestBody> map = new HashMap<>();

        for (String picPath : filePaths
                ) {

            RequestBody fileBody = RequestBody.create(MediaType.parse("multipart/form-data"), new File(compressImage(picPath)));
           // RequestBody fileBody = RequestBody.create(MediaType.parse("image/png"), new File(compressImage(picPath)));
           // RequestBody fileBody = RequestBody.create(MediaType.parse("image/png"), new File(picPath));
            map.put("image\"; filename=\"" + System.currentTimeMillis() + "", fileBody);

        }
        return map;
    }

    public static RequestBody toRequestBody(String infos) {

        return RequestBody.create(MediaType.parse("text/plain"), infos);
    }


    public static MultipartBody.Part picToMultipartBodyPart(String filePath) {

        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), new File(compressImage(filePath)));
       return MultipartBody.Part.createFormData("file", System.currentTimeMillis() + "", requestBody);

    }
//    public static MultipartBody.Part picToMultipartBodyPart1(String filePath) {
//        RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), new File(filePath));
//        MultipartBody.Part part = MultipartBody.Part.createFormData("file", System.currentTimeMillis() + "", requestBody);
//        return part;
//    }

    public static MultipartBody.Part picToMultipartBodyPart(String tagName, String filePath) {

        RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), new File(filePath));
        return MultipartBody.Part.createFormData(tagName, System.currentTimeMillis() + "", requestBody);
    }

    public static MultipartBody.Part mp4ToMultipartBodyPart(String tagName, String filePath) {

        RequestBody requestBody = RequestBody.create(MediaType.parse("video/mp4"), new File(filePath));
        return MultipartBody.Part.createFormData(tagName, System.currentTimeMillis() + ".mp4", requestBody);
    }
//
//    public static MultipartBody.Part fileToMultipartBodyPart_(String filePath) {
//
//
//        RequestBody requestFile =
//                RequestBody.create(MediaType.parse("multipart/form-data"), new File(filePath));
//        MultipartBody.Part part = MultipartBody.Part.createFormData("file", System.currentTimeMillis() + "", requestFile);
//        return part;
//    }

    public static MultipartBody filesToMultipartBody(List<String> filePaths) {
        MultipartBody.Builder builder = new MultipartBody.Builder();

        for (String path : filePaths) {
            File file = new File(path);
            // TODO: 16-4-2  这里为了简单起见，没有判断file的类型
            RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), file);
            builder.addFormDataPart("file", file.getName(), requestBody);
        }
        builder.setType(MultipartBody.FORM);
        return builder.build();
    }



    /**
     * 图片压缩-质量压缩
     *
     * @param filePath 源图片路径
     * @return 压缩后的路径
     */

    public static String compressImage(String filePath) {

        //原文件
        File oldFile = new File(filePath);


        //压缩文件路径 照片路径/
        String targetPath = oldFile.getPath()+"1";
        int quality = 50;//压缩比例0-100
        Bitmap bm = getSmallBitmap(filePath);//获取一定尺寸的图片
        int degree = getRotateAngle(filePath);//获取相片拍摄角度

        if (degree != 0) {//旋转照片角度，防止头像横着显示
            bm = setRotateAngle(degree,bm);
        }
        File outputFile = new File(targetPath);
        try {
            if (!outputFile.exists()) {
                outputFile.getParentFile().mkdirs();
                //outputFile.createNewFile();
            } else {
                outputFile.delete();
            }
            FileOutputStream out = new FileOutputStream(outputFile);
            bm.compress(Bitmap.CompressFormat.JPEG, quality, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return filePath;
        }
        return outputFile.getPath();
    }


    /**
     * 旋转图片角度
     *
     * @param angle
     * @param bitmap
     * @return
     */
    public static Bitmap setRotateAngle(int angle, Bitmap bitmap) {

        if (bitmap != null) {
            Matrix m = new Matrix();
            m.postRotate(angle);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(),
                    bitmap.getHeight(), m, true);
            return bitmap;
        }
        return bitmap;

    }
    /**
     * 获取图片的旋转角度
     *
     * @param filePath
     * @return
     */
    public static int getRotateAngle(String filePath) {
        int rotate_angle = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(filePath);
            int orientation = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            switch (orientation) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    rotate_angle = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    rotate_angle = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    rotate_angle = 270;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rotate_angle;
    }

    /**
     * 根据路径获得图片信息并按比例压缩，返回bitmap
     */
    public static Bitmap getSmallBitmap(String filePath) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;//只解析图片边沿，获取宽高
        BitmapFactory.decodeFile(filePath, options);
        // 计算缩放比
        options.inSampleSize = calculateInSampleSize(options, 480, 800);
        // 完整解析图片返回bitmap
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(filePath, options);
    }
    public static int calculateInSampleSize(BitmapFactory.Options options,
                                            int reqWidth, int reqHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        return inSampleSize;
    }
}
