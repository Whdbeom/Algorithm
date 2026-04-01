import java.util.*;

class Solution {
	private Map<String, PriorityQueue<String>> graph = new HashMap<>();
	private List<String> route = new ArrayList<>();

	public String[] solution(String[][] tickets) {
		// 그래프 구성
		for (String[] ticket : tickets) {
			String from = ticket[0];
			String to = ticket[1];

			graph.putIfAbsent(from, new PriorityQueue<>());
			graph.get(from).offer(to);
		}

		// ICN에서 시작
		dfs("ICN");

		// 후위 순회로 들어가 있으므로 뒤집기
		Collections.reverse(route);

		return route.toArray(new String[0]);
	}

	private void dfs(String airport) {
		PriorityQueue<String> nextAirports = graph.get(airport);

		// 현재 공항에서 갈 수 있는 티켓을 모두 소진
		while (nextAirports != null && !nextAirports.isEmpty()) {
			String next = nextAirports.poll();
			dfs(next);
		}

		// 더 이상 갈 곳이 없을 때 경로에 추가
		route.add(airport);
	}
}