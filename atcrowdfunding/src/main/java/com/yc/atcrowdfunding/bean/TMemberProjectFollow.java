package com.yc.atcrowdfunding.bean;

public class TMemberProjectFollow {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.projectid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_project_follow.memberid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    private Integer memberid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.id
     *
     * @return the value of t_member_project_follow.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.id
     *
     * @param id the value for t_member_project_follow.id
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.projectid
     *
     * @return the value of t_member_project_follow.projectid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.projectid
     *
     * @param projectid the value for t_member_project_follow.projectid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_project_follow.memberid
     *
     * @return the value of t_member_project_follow.memberid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_project_follow.memberid
     *
     * @param memberid the value for t_member_project_follow.memberid
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
}