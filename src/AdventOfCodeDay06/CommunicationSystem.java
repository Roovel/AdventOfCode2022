package AdventOfCodeDay06;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommunicationSystem {

    //Mostly done with outside help

    public CommunicationSystem() {
    }

    public String readInputAsString() {
        try
        {
            return Files.readString(Path.of("Inputs/input06.txt"));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public int findMarkers(String input, int length)
    {
        for (int i = 0; i < input.chars().count(); i++)
        {
            if (input.substring(i, i + length).chars().distinct().count() == length)
            {
                return length + i;
            }
        }

        return -1;
    }
}
