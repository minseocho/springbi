package springbootgi.springbootbi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
	public String bookCd;
	public String subject;
	public String content;
	public String writer;

	public Book() {
    }

	public String getBookCd() {
		return bookCd;
	}
	public void setBookCd(String bookCd) {
		this.bookCd = bookCd;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
    public String toString() {
        return "Book{" +
                "bookCd='" + bookCd + '\'' +
                ", subject=" + subject +
                ", content=" + content +
                ", writer=" + writer +
                '}';
    }

}
