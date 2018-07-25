package ssm.blog.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import ssm.blog.service.IHtml2PdfService;

import com.itextpdf.text.DocumentException;

public class Html2PdfServiceImpl implements IHtml2PdfService {
    @Override
    public void write(String htmlContent, OutputStream os) {
        if (htmlContent == null || htmlContent.length() == 0)
            return;

        if (os == null)
            return;

        htmlContent = getIntaceHtml(htmlContent);
        doWrite(htmlContent, os);
    }
    
    /**
     * 根据提供的html内容，获取完整的html内容.<br>
     * @param htmlContent
     * @return
     */
    private String getIntaceHtml(String htmlContent) {
        boolean intact = htmlContent.trim().toLowerCase()
                .startsWith(INTACT_FLAG);
        if (!intact) {
            htmlContent = TEMPLATE_HTML.replaceFirst("\\$\\{content\\}", htmlContent);
        }

        return htmlContent;
    }
    
    /**
     * 实施写操作.<br>
     * @param htmlContent
     * @param os
     */
    private void doWrite(String htmlContent, OutputStream os) {
        InputStream is = new ByteArrayInputStream(htmlContent.getBytes());

        com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        com.itextpdf.text.pdf.PdfWriter writer = null;
        try {
            writer = com.itextpdf.text.pdf.PdfWriter
                    .getInstance(document, os);
            document.open();
            
            com.itextpdf.tool.xml.XMLWorkerHelper.getInstance().parseXHtml(writer,
                    document, is, Charset.forName("gbk"));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        writer.flush();
        // SINOBEST HTML2PDF 如果我们调用writer.close()，可能无法正常的生成pdf，甚至会遇到
        // Exception:The page 1 was requested but the document has only 0 pages.
        // writer.close();
        document.close();
    }
}
