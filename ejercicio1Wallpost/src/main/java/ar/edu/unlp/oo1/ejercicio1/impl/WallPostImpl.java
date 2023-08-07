package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String text;
	private int likes;
	private boolean featured;
	
	public WallPostImpl() {
		this.text = "Undefined post";
		this.featured = false;
		this.likes = 0;
	}

	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */ 
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;		
	}

	@Override
	public WallPost text(String text) {
		this.setText(text);
		return this;
	}

	@Override
	public int getLikes() {
		return this.likes;
	}

	@Override
	public WallPost like() {
		this.likes++;
		return this;
	}

	@Override
	public WallPost dislike() {
		if(this.likes > 0) {
			this.likes--;
		}
		return this;
	}

	@Override
	public boolean isFeatured() {
		return (this.featured) ? true : false;
	}

	@Override
	public WallPost toggleFeatured() {
		if(this.featured) {
			this.featured = false;
		}else {
			this.featured = true;
		}
		return this;
	}    

}
