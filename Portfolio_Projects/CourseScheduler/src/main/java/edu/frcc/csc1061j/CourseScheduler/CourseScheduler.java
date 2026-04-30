package edu.frcc.csc1061j.CourseScheduler;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CourseScheduler {
	
    public static void main(String[] args) {
        // check if filename was provided
        if (args.length < 1) {
            System.out.println("File needed.");
            return;
        }

        String fileName = args[0];
        Graph<String> courseGraph = buildGraph(fileName);

        if (courseGraph != null) {
            topologicalSort(courseGraph);
        }
    }

    private static Graph<String> buildGraph(String fileName) {
        try {
            // initialize graph and set node values
            Scanner scanner = new Scanner(new File(fileName));
            if (!scanner.hasNextInt()) {
            	return null;
            }
            int numCourses = scanner.nextInt();
            Graph<String> graph = new Graph<>(numCourses);

            for (int i = 0; i < numCourses; i++) {
                String courseName = scanner.next();
                graph.setValue(i, courseName);
                // skip prerequisites
                int numPrereqs = scanner.nextInt();
                for (int j = 0; j < numPrereqs; j++) {
                    scanner.next();
                }
            }
            scanner.close();

            // add edges
            scanner = new Scanner(new File(fileName));
            scanner.nextInt();

            for (int i = 0; i < numCourses; i++) {
                String courseName = scanner.next();
                int numPrereqs = scanner.nextInt();
                for (int j = 0; j < numPrereqs; j++) {
                    String prereqName = scanner.next();
                    // prereq must be taken first, so edge goes prereq to course
                    graph.insertEdge(prereqName, courseName);
                }
            }
            scanner.close();
            return graph;

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return null;
        } catch (Exception e) {
            System.out.println("Error reading file.");
            return null;
        }
    }

    private static void topologicalSort(Graph<String> graph) {
        int size = graph.getSize();
        List<String> ordering = new ArrayList<>();
        List<Integer> activeSet = new ArrayList<>();

        // initial in-degree calculation
        int[] inDegrees = new int[size];
        for (int to = 0; to < size; to++) {
            for (int from = 0; from < size; from++) {
                if (graph.isEdge(from, to)) {
                    inDegrees[to]++;
                }
            }
        }

        // find nodes with no incoming edges
        for (int i = 0; i < size; i++) {
            if (inDegrees[i] == 0) {
                activeSet.add(i);
            }
        }

        // algorithm loop
        while (!activeSet.isEmpty()) {
            int nIndex = activeSet.remove(0);
            ordering.add(graph.getValue(nIndex));

            // for each edge coming out of N and into M
            for (int mIndex = 0; mIndex < size; mIndex++) {
                if (graph.isEdge(nIndex, mIndex)) {
                    // Remove edge and update in-degree
                    graph.removeEdge(nIndex, mIndex);
                    inDegrees[mIndex]--;

                    // if m now has no edges coming into it, add to active set
                    if (inDegrees[mIndex] == 0) {
                        activeSet.add(mIndex);
                    }
                }
            }
        }

        // final validation
        if (ordering.size() < size) {
            System.out.println("Can't take those courses.");
        } else {
            for (String course : ordering) {
                System.out.println(course);
            }
        }
    }
}
