package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class P176962 {

    public static void main(String[] args) {
        P176962 o = new P176962();

//        [["science", "12:40", "50"], ["music", "12:20", "40"], ["history", "14:00", "30"], ["computer", "12:30", "100"]]
        String[] solution = o.solution(new String[][]{
                {"science", "12:40", "50"},
                {"music", "12:20", "40"},
                {"history", "14:00", "30"},
                {"computer", "12:30", "100"}
        });

        Arrays.stream(solution).forEach(System.out::println);
    }

    public String[] solution(String[][] plans) {
        List<String> result = new LinkedList<>();
        Stack<Plan> stack = new Stack<>();

        List<Plan> planList = new LinkedList<>();
        for (String[] plan : plans) {
            planList.add(new Plan(plan[0], plan[1], Integer.valueOf(plan[2])));
        }

        planList.sort(Plan::compareTo);
        for (int i = 0; i < planList.size(); i++) {
            Plan plan = planList.get(i);

            if (i == planList.size() - 1) {
                result.add(plan.getName());
                break;
            }

            Plan nextPlan = planList.get(i + 1);
            int remainTime = nextPlan.getRemainTime(plan.getStartTime());
            if (plan.getTime() > remainTime) {
                plan.subtractTime(remainTime);
                stack.push(plan);
                continue;
            }

            remainTime -= plan.getTime();
            result.add(plan.getName());

            while (true) {
                if (remainTime == 0) {
                    break;
                }
                if (stack.empty()) {
                    break;
                }
                Plan pop = stack.pop();
                if (plan.getTime() > remainTime) {
                    plan.subtractTime(remainTime);
                    stack.push(pop);
                    remainTime = 0;
                    continue;
                }

                remainTime -= plan.getTime();
                result.add(pop.getName());
            }
        }

        while (!stack.empty()) {
            result.add(stack.pop().getName());
        }

        String[] answer = new String[result.size()];
        for (String name : result) {
            answer[result.indexOf(name)] = name;
        }
        return answer;
    }

    public static class Plan implements Comparable<Plan> {
        private final String name;
        private final Integer startTime;
        private Integer time;

        public Plan(String name, String startTime, Integer time) {
            this.name = name;
            this.startTime = convertTime(startTime);
            this.time = time;
        }

        public Integer convertTime(String time) {
            return (Integer.parseInt(time.split(":")[0]) * 60) + Integer.parseInt(time.split(":")[1]);
        }

        public String getName() {
            return name;
        }

        public Integer getStartTime() {
            return startTime;
        }

        public Integer getTime() {
            return time;
        }

        public Integer getRemainTime(Integer targetStartTime) {
            return startTime - targetStartTime;
        }

        public void subtractTime(Integer time) {
            this.time -= time;
            if (this.time < 0) {
                this.time = 0;
            }
        }

        @Override
        public int compareTo(Plan o) {
            return this.startTime.compareTo(o.startTime);
        }
    }

}
