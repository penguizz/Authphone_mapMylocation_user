package com.example.desktop.myproject.Activity;

/**
 * Created by Desktop on 24 ม.ค. 2561.
 */

public interface UserManagerHelper {

    public static final String DATABASE_NAME = "ahoy_login";
    public static final int DATABASE_VERSION = 1;

    /**
     * ทำการเซฟข้อมูล User ลงฐานข้อมูล
     *
     * @param user
     * @return หากบันทึกสำเร็จจะส่งค่า row ID กลับมา ถ้ามี error จะส่ง -1
     */
    public long registerUser(StudentUser user);

    /**
     * ทำการเช็ค User ว่าล็อคอินด้วย username และ password <br />
     * ถูกต้องตรงกับในฐานข้อมูลหรือไม่ (มันก็คือการ query sqlite นั่นเอง) <br />
     * หาก query ด้วย username, password แล้วมีข้อมูล แสดงว่า ล็อคอินถูกต้อง
     *
     * @param user
     * @return - หากตรง ก็ส่งค่าเป็น user นั้นๆกลับไป หากไม่ตรงก็ส่ง null
     */
    public StudentUser checkUserLogin(StudentUser user);

    /**
     * สำหรับเปลี่ยน password โดยทำการ query หาข้อมูล username, password ก่อน <br />
     * จากนั้นถึง update โดยเปลี่ยน password ใหม่แทน
     *
     * @param user
     * @return - ส่งค่า จำนวนแถวที่มีการ update
     */
    public int changePassword(StudentUser user);
}