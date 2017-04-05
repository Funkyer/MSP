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

    private String name;

    private int vodType;

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
}
