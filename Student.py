class Student():
    def __init__(self, name, group, motto, hobby, profession):
        self.name = name
        self.group = group
        self.motto = motto
        self.hobby = hobby
        self.profession = profession
    def __str__(self):
        return ("\nFIO:\t\t\t\t\tGroup:\t\tProfession:\tHobby:\t\t\tMotto:\n"
                + self.name + "\t" + self.group + "\t" + self.profession + "\t"
                + self.hobby + "\t" + self.motto)
def main():
    name = "Filippovich Eugene Aleksandrovich"
    group = "10701117"
    prof = "programer"
    hobby = "sport, Rubik's Cube"
    motto = "To get out of the pit - you need to firmly stand on the bottom."
    student = Student(name,group,motto,hobby,prof)
    print(student)

main()
