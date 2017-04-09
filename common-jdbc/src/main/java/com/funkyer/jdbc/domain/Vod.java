/**
 *
 */
package com.funkyer.jdbc.domain;

/**
 * @author dell
 *
 */
public class Vod
{
	private String id;

	/**
	 * 简介
	 */
	private String introduce;
	/**
	 * 名称
	 */
    private String name;
    
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVodType() {
        return vodType;
    }

    public void setVodType(int vodType) {
        this.vodType = vodType;
    }

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
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

	@Override
	public String toString() {
		return "Vod [id=" + id + ", introduce=" + introduce + ", name=" + name
				+ ", vodType=" + vodType + ", detailType=" + detailType
				+ ", artist=" + artist + ", particularDate=" + particularDate
				+ ", poster=" + poster + "]";
	}
    
}
