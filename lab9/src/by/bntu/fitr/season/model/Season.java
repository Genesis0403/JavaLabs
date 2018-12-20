package by.bntu.fitr.season.model;

public class Season {
    public String execute(int month){
        String result;
        switch(month){
            case 1:
            case 2:
            case 12:  result = "winter";break;
            case 3:
            case 4:
            case 5: result = "spring"; break;
            case 6:
            case 7:
            case 8: result = "summer"; break;
            case 9:
            case 10:
            case 11: result = "autumn"; break;
            default:
                result = "Input number in range(1-12)!\r\n";
        }
        return result;
    }
}
