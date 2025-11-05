package com.example.book.controller;

import com.example.book.Models.Book;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	 @GetMapping("/book")
	    public String showBookPage() {
	        return "download";
	    }

    @GetMapping("/generate-book-pdf")
    public void generateBookPdf(HttpServletResponse response) throws Exception {

     
        Book book = new Book(
                "Spring Boot in Action",
                "Craig Walls",
                "A practical guide to building Spring Boot applications.",
                599.00,
                "2023-05-10"
        );

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=book.pdf");

        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {

                // Header
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
                contentStream.beginText();
                contentStream.newLineAtOffset(50, 750);
                contentStream.showText("Book Details");
                contentStream.endText();

                // Content
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                int y = 720;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText("Title: " + book.getTitle());
                contentStream.endText();

                y -= 20;
                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText("Author: " + book.getAuthor());
                contentStream.endText();

                y -= 20;
                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText("Description: " + book.getDescription());
                contentStream.endText();

                y -= 20;
                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText("Price: Rs." + book.getPrice());
                contentStream.endText();

                y -= 20;
                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText("Published Date: " + book.getPublishedDate());
                contentStream.endText();
            }

            document.save(response.getOutputStream());
        }
    }
}
