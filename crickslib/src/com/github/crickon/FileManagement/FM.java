package com.github.crickon.FileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FM
{
	public static PrintWriter createWriter(String path)
	{
		Writer writer = null;
		try
		{
			writer = new FileWriter(path, false);
		}
		catch (IOException e)
		{
		}
		return new PrintWriter(writer);
	}

	public static BufferedReader createReader(String path) throws FileNotFoundException
	{
		return new BufferedReader(new FileReader(path));
	}

	public static boolean areEqual(String[] fileStrings)
	{
		File[] files = new File[fileStrings.length];
		for (int i = 0; i < fileStrings.length; i++)
			files[i] = new File(fileStrings[i]);

		return areEqual(files);
	}

	public static boolean areEqual(File[] files)
	{
		Scanner[] readers = new Scanner[files.length];
		for (int i = 0; i < files.length; i++)
		{
			try
			{
				readers[i] = new Scanner(files[i]);
			}
			catch (FileNotFoundException e)
			{
			}
		}
		boolean same = true;
		while (readers.length != 0 && readersHaveNext(readers))
		{
			String[] lines = new String[files.length];
			for (int i = 0; i < files.length; i++)
				lines[i] = readers[i].nextLine();
			for (int i = 1; i < files.length; i++)
				same = same && lines[i - 1].equals(lines[i]);

		}
		return same;
	}

	public static boolean readersHaveNext(Scanner[] readers)
	{
		if (readers.length == 0)
			return false;
		boolean hasNext = true;
		for (Scanner reader : readers)
			hasNext = hasNext && reader.hasNext();
		return hasNext;
	}

}
