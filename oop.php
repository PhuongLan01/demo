<?php
//Phòng học hiện tại có 83 Sinh viên
//Danh sách tên của 83 bạn SV: mỗi bạn SV bao gồm các thông tin (MaSV, HoVaTen, NgaySinh, Gioitinh)
class Student{
    //Thuộc tính
    private $stdID;
    private $stdName;
    private $stdDOB;
    private $stdSex;

    private $gpa;


    //Phương thức

    /**
     * @param $stdID
     * @param $stdName
     * @param $stdDOB
     * @param $stdSex
     */
    public function __construct($stdID, $stdName, $stdDOB, $stdSex)
    {
        $this->stdID = $stdID;
        $this->stdName = $stdName;
        $this->stdDOB = $stdDOB;
        $this->stdSex = $stdSex;
    }

    /**
     * @return mixed
     */
    public function getStdID()
    {
        return $this->stdID;
    }

    /**
     * @param mixed $stdID
     */
    public function setStdID($stdID): void
    {
        $this->stdID = $stdID;
    }

    /**
     * @return mixed
     */
    public function getStdName()
    {
        return $this->stdName;
    }

    /**
     * @param mixed $stdName
     */
    public function setStdName($stdName): void
    {
        $this->stdName = $stdName;
    }

    /**
     * @return mixed
     */
    public function getStdDOB()
    {
        return $this->stdDOB;
    }

    /**
     * @param mixed $stdDOB
     */
    public function setStdDOB($stdDOB): void
    {
        $this->stdDOB = $stdDOB;
    }

    /**
     * @return mixed
     */
    public function getStdSex()
    {
        return $this->stdSex;
    }

    /**
     * @param mixed $stdSex
     */
    public function setStdSex($stdSex): void
    {
        $this->stdSex = $stdSex;
    }

    /**
     * @return mixed
     */
    public function getGpa()
    {
        return $this->gpa;
    }

    /**
     * @param mixed $gpa
     */
    public function setGpa($gpa): void
    {
        $this->gpa = $gpa;
    }
}
$student1 = new Student('1951960795', 'Vũ Trung Kiên', '19/7/2002','Nam');

$student2 = new Student('1951960796', 'Nguyễn Ngọc Nam', '19/7/2002','Nam');

$students = [$student1, $student2];

echo $student1->getStdID();

foreach($students as $student){
    echo $student->getStdName().'<br>';
}
