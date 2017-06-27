package com.oanda.v20.user;

import com.google.gson.annotations.SerializedName;

/**
 * A representation of user information, as provided to the user themself.
 */
public class UserInfo {

    /**
     * Default constructor.
     */
    public UserInfo() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the UserInfo to copy
     */
    public UserInfo(UserInfo other) {
        this.username = other.username;
        if (other.userID != null)
        {
            this.userID = new Integer(other.userID);
        }
        this.country = other.country;
        this.emailAddress = other.emailAddress;
    }

    @SerializedName("username") private String username;

    /**
     * Get the username
     * <p>
     * The user-provided username.
     * <p>
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username
     * <p>
     * The user-provided username.
     * <p>
     * @param username the username as a String
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setUsername(String username) {
        this.username = username;
        return this;
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Get the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @return the userID
     */
    public Integer getUserID() {
        return this.userID;
    }

    /**
     * Set the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @param userID the userID as an Integer
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("country") private String country;

    /**
     * Get the country
     * <p>
     * The country that the user is based in.
     * <p>
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Set the country
     * <p>
     * The country that the user is based in.
     * <p>
     * @param country the country as a String
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setCountry(String country) {
        this.country = country;
        return this;
    }

    @SerializedName("emailAddress") private String emailAddress;

    /**
     * Get the emailAddress
     * <p>
     * The user's email address.
     * <p>
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress
     * <p>
     * The user's email address.
     * <p>
     * @param emailAddress the emailAddress as a String
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
}