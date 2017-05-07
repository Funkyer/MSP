/**
 *
 */
package com.funkyer.jdbc.domain;

/**
 * @author dell
 *
 */
public class Vod extends Content
{
    /**
     * 类型
     */
    private int vodType;

    /**
     * 详细类型
     */
    private String detailType;

    /**
     * 艺术家
     */
    private String artist;

    /**
     * 发行日期
     */
    private String particularDate;

    /**
     * 海报地址
     */
    private String poster;

	/**
	 * 时长
	 */
	private long duration;


    public int getVodType() {
        return vodType;
    }

    public void setVodType(int vodType) {
        this.vodType = vodType;
    }


	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getParticularDate() {
		return particularDate;
	}

	public void setParticularDate(String particularDate) {
		this.particularDate = particularDate;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Vod{" +
				"vodType=" + vodType +
				", detailType='" + detailType + '\'' +
				", artist='" + artist + '\'' +
				", particularDate='" + particularDate + '\'' +
				", poster='" + poster + '\'' +
				", duration=" + duration +
				'}'+ super.toString();
	}
}
