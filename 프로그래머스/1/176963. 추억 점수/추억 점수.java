class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int currentPhotoScore = 0;
            
            for(int j = 0; j < photo[i].length; j++){
                String personInPhoto = photo[i][j];
                
                // 진짜 그리움 사람이랑 비교
                for(int k = 0; k < name.length; k++){
                    if(personInPhoto.equals(name[k])){
                        currentPhotoScore += yearning[k];
                        break;
                    }
                }
            }
            answer[i] = currentPhotoScore;
        }
        return answer;        
    }
}