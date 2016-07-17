/* NotepadOpener.java - Jul 16, 2016 9:16:02 PM - Copyright 2016 Oplecion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package oplecion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class NotepadOpener {
	public static void main(String... args) throws IOException, InterruptedException {
		// example: declaring a variable
		// DataType variableName = value;

		// declaring a username variable
		// String username = "Goon";

		// example; using a variable within a string
		// String message = "hello " + username;

		// outputting a username variable
		// System.out.println("Hello...." + username);

		// modifying the value of a variable to "world"
		// username = "world...for a good person";

		// outputting the modified username variable
		// System.out.println("Hello...." + username);

		// try to open a blank notepad instance
		// Runtime.getRuntime().exec("notepad.exe");

		// getting notepad to say something
		// String message = "Hello and Welcome to Notepad by Microsoft";
		// writeFile(message);
		// Runtime.getRuntime().exec("notepad.exe /a \"file.txt\"");

		//
		// CREATING A JOPTIONPANE TO GET INPUTS
		//

		// example: asking a user how they feel
		// String mood = JOptionPane.showInputDialog("How do you feel?");
		// System.out.println("The user currently feels " + mood);

		// excercise:
		// 1. declare a variable called message
		// 2. ask the user for their message and store it in the variable
		// 3. call the writeFile method and pass in the message varible
		// 4. run notepad using the written file
		//
		// this exercise should only take three lines of code
		// String message = JOptionPane.showInputDialog("What are you looking
		// for?");
		// writeFile(message);
		// Runtime.getRuntime().exec("notepad.exe /a \"file.txt\"");

		// excercise:
		// 1. declare a variable called message
		// 2. ask the user for their message and store it in the variable
		// 3. if the user enters money then modify the message variable to show
		// dollar signs instead
		// 4. call the writeFile method and pass in the message variable
		// 5. run notepad using the written file
		//
		// this exercise should only take 5-7 lines of code
		// String message = JOptionPane.showInputDialog("What are you looking
		// for?");
		// if (message.equals("money")) {
		// message = "$$$";
		// }
		// writeFile(message);
		// Runtime.getRuntime().exec("notepad.exe /a \"file.txt\"");

		// excercise:
		// 1. declare a variable called message
		// 2. ask the user for their message and store it in the variable
		// 3. if the user enters money then modify the message variable to show
		// dollar signs instead
		// 4. otherwise, if the user enters milk then modify the message to show
		// there is no cow level
		// 5. finally, if the user enters anything else then just show what they
		// entered
		// 6. call the writeFile method and pass in the message variable
		// 7. run notepad using the written file
		//
		// this exercise should only take 7-9 lines of code
		String message = JOptionPane.showInputDialog("What are you looking for?");
		if (message == null) {
			return;
		}

		if (message.equals("money")) {
			message = "$$$";

		} else if (message.equals("milk")) {
			message = "there is no cow level";
		}

		writeFile(message);
		Process notepad = Runtime.getRuntime().exec("notepad.exe /a \"file.txt\"");
		notepad.waitFor();
		File leftOverFile = new File("file.txt");
		leftOverFile.delete();
	}

	private static void writeFile(String message) throws IOException {
		try (BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"))) {
			out.write(message);
		}
	}
}
