package BasicPractice;

public class Reviews {
	
	Integer rating;
	String comment;
	String date;
	String reviewerName;
	String reviewerEmail;
	
	
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public String getReviewerEmail() {
		return reviewerEmail;
	}
	public void setReviewerEmail(String reviewerEmail) {
		this.reviewerEmail = reviewerEmail;
	}
	
	@Override
	public String toString() {
		return "Reviews [rating=" + rating + ", comment=" + comment + ", date=" + date + ", reviewerName="
				+ reviewerName + ", reviewerEmail=" + reviewerEmail + "]";
	}
	
	

}
