package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Coment> coments = new ArrayList<>();

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Coment> getComents() {
		return coments;
	}

	public void addComents(Coment coment) {
		coments.add(coment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Moment: ");
		sb.append(sdf.format(moment));
		sb.append("\n");
		sb.append("Title: ");
		sb.append(title);
		sb.append("\n");
		sb.append("Coment: ");
		sb.append(content);
		sb.append("\n");
		sb.append("likes: ");
		sb.append(likes);
		sb.append("\n");
		for(Coment c : coments) {
			sb.append(c);
			sb.append("\n");
		}		
		return sb.toString();
	}
	
}
