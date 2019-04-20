package cn.hdu.learn.miaosha.dal.dao;

import cn.hdu.learn.miaosha.dal.model.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MiaoshaUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    int insert(MiaoshaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    int insertSelective(MiaoshaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    MiaoshaUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    int updateByPrimaryKeySelective(MiaoshaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miaosha_user
     *
     * @mbggenerated Sun Apr 07 11:27:24 CST 2019
     */
    int updateByPrimaryKey(MiaoshaUser record);

    @Select("select * from miaosha_user where id = #{id}")
    MiaoshaUser getById(@Param("id") Long id);
}