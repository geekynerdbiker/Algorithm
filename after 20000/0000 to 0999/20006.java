import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        User[] users = new User[p];
        Room[] rooms = new Room[p];
        boolean[] userStatus = new boolean[p];

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            users[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        int roomNumber = 0;
        int levelLimit = 0;
        while (!everyoneJoined(userStatus)) {
            rooms[roomNumber] = new Room();
            for (int i = 0; i < p; i++) {
                if (userStatus[i]) continue;
                if (rooms[roomNumber].users.size() == 0) {
                    rooms[roomNumber].users.add(users[i]);
                    levelLimit = users[i].level;
                    userStatus[i] = true;
                    continue;
                }
                if(rooms[roomNumber].users.size() == m) break;
                if (users[i].level >= levelLimit - 10 && users[i].level <= levelLimit + 10) {
                    rooms[roomNumber].users.add(users[i]);
                    userStatus[i] = true;
                }
            }
            if (rooms[roomNumber].users.size() == m)
                rooms[roomNumber].status = "Started!\n";
            roomNumber++;
        }

        for (int i = 0; i < roomNumber; i++) {
            System.out.print(rooms[i].status);
            for (int j = 0; j < rooms[i].users.size(); j++)
                System.out.println(rooms[i].users.get(j).level + " " + rooms[i].users.get(j).nickname);
        }

    }

    public static boolean everyoneJoined(boolean[] status) {
        for (boolean stat : status) if (!stat) return false;
        return true;
    }
}

class User {
    int level;
    String nickname;

    User(int level, String nickname) {
        this.level = level;
        this.nickname = nickname;
    }
}

class Room {
    String status;
    ArrayList<User> users;

    Room() {
        this.status = "Waiting!\n";
        this.users = new ArrayList<User>();
    }
}