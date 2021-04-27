import java.time.LocalDateTime;

class ToDo {
	private String title = "";
	private String content = "";
	private String author = "Anonymous";
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
	private LocalDateTime add_date = dtf.format(LocalDateTime.now());

	//1 Constructor author unknown
	public ToDo(String title, String content){
		this.title = title;
		this.content = content;
	}

	//2 Constructor
	public ToDo(String title, String content, String author){
		this.title = title;
		this.content = content;
		this.author = author;
	}

	//3 Constructor
  public ToDo(String title, String content, String author, LocalDateTime add_date){
    this.title = title;
    this.content = content;
    this.author = author;
    this.add_date= add_date;
  }

	public String getContent(){
		return content;
	}

	public LocalDateTime getAdd_Date(){
		return add_date;
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	@Override
	public String toString(){
		return "Title: "+title+"\n"
			+"Content: "+content+"\n"
			+"Author: "+author+"\n"
			+"Data: "+add_date+"\n";
	}

}
