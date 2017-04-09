package com.funkyer.msp.api.dto;

/**
 * Created by liushi on 17/4/8.
 */
public class PlayVodResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String playUrl;
	
	private String name;
	
	private String artist;
	
	private long duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}

	public String getPlayUrl() {
		return playUrl;
	}

	@Override
	public String toString() {
		return "PlayVodResponse [playUrl=" + playUrl + ", name=" + name
				+ ", artist=" + artist + ", duration=" + duration + "]";
	}
	
}
