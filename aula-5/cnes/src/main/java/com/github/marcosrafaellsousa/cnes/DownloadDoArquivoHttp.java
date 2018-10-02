package com.github.marcosrafaellsousa.cnes;

        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.InputStream;
        import java.net.HttpURLConnection;
        import java.net.URL;

/**
 * Uma classe que baixa um arquivo de um servidor qualquer
 * @author Marcos Rafael
 */

public class DownloadDoArquivoHttp {
    private static final int BUFFER_SIZE = 4096;

    /**
     * Baixa um arquivo pela url
     * @param fileURL HTTP URL do arquivo a ser baixado
     * @throws IOException
     */
    public static void downloadFile(String fileURL)
            throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();


            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Disposition = " + disposition);
            System.out.println("Content-Length = " + contentLength);

            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();





            inputStream.close();

            System.out.println("Arquivo baixado");
        } else {
            System.out.println("Sem arquivo para baixar");
        }
        httpConn.disconnect();
    }
}