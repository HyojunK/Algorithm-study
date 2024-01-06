public int mySqrt(int x) {
        int answer = 0;

        while((long)answer * answer <= x) {
            answer++;
        }

        return answer - 1;
    }