package hust.soict.dsai.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public Media() {
		this.title = "";
        this.category = "";
        this.cost = 0.0f;
    }
	
	public Media(String title) {
		this.title = title;
		
	}
	public Media(String title, String category) {
		this(title);
		this.category = category;
		
	}
	public Media(String title, String category, float cost) {
		this(title,category);
		this.cost = cost;
		
	}
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}

	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) { 
	        return true;
	    }
	    if (obj == null || this.getClass() != obj.getClass()) { // kiểm tra xem có rỗng hay không , và xem có thuộc cùng 1 class hay không
	        return false;
	    }
	    Media otherMedia = (Media) obj;
	    return this.title.equals(otherMedia.title);
	}
}
