import java.util.*;

public class Menu {


    public static Action showMenu(List<Action> actions, Camper camper) {
        Scanner scanner = new Scanner(System.in);
        char startChar = 'a';

        Map<Character, Action> keyToActionMap = new HashMap<>();

        for (Action action : actions) {
            keyToActionMap.put(startChar, action);
            System.out.println(startChar + ": " + action.menuDescription(camper));
            startChar++;
        }

        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));

        return keyToActionMap.get(key);
    }
}