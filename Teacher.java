import org.w3c.dom.ls.LSOutput;

import static java.lang.System.*;

public class Teacher {
    public String startLesson (){
        return "Достаём учебники";
    }
}
class GeographyTeacher extends Teacher{
    @Override
    public String startLesson(){
        return "Достаём глобусы";
    }
}
class GymTeacher extends Teacher{
    public String startLesson(){
        super.startLesson();
        return "Стройтесь по росту";

    }
}