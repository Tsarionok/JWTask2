package main.by.training.epam.entity;

public abstract class SimplePart {

	private String item;
	
	public SimplePart(String item) {
		this.item = item;
	}

	public abstract boolean isWord();
	public abstract boolean isSpace();
	public abstract boolean isPunctuation();
	
	public String getItem() {
		return item;
	}

	@Override
	public String toString() {
		return item;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimplePart other = (SimplePart) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		return true;
	}

	
	
}
