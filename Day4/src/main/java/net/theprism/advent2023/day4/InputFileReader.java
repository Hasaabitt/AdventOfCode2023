package net.theprism.advent2023.day4;

import java.io.*;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Utilities for reading files as input. Internally uses a buffered reader
 */
public class InputFileReader implements Iterable<String> {
    /**
     * Creates an input reader from a resource
     *
     * @param resourcePath resource path
     * @return InputFileReader instance
     */
    public static InputFileReader getResource(String resourcePath) {
        InputStream stream = InputFileReader.class.getResourceAsStream(resourcePath);
        if (stream == null) throw new NullPointerException("Could not find resource at " + resourcePath);
        return new InputFileReader(new BufferedReader(new InputStreamReader(stream)));
    }

    private final BufferedReader reader;

    /**
     * Creates an input reader from a path
     *
     * @param path file path
     * @throws FileNotFoundException if file cannot be opened
     */
    public InputFileReader(String path) throws FileNotFoundException {
        this(new BufferedReader(new FileReader(path)));
    }

    /**
     * Creates an input reader from a file
     *
     * @param file file object
     * @throws FileNotFoundException if file cannot be opened
     */
    public InputFileReader(File file) throws FileNotFoundException {
        this(new BufferedReader(new FileReader(file)));
    }

    /**
     * Creates an input reader from a buffered reader
     *
     * @param reader buffered reader
     */
    public InputFileReader(BufferedReader reader) {
        this.reader = reader;
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    /**
     * Closes stream
     *
     * @throws IOException IOException
     */
    public void close() throws IOException {
        reader.close();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                boolean next;
                try {
                    reader.mark(3000);
                    next = reader.readLine() != null;
                    reader.reset();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return next;
            }

            @Override
            public String next() {
                try {
                    if (hasNext()) {
                        return reader.readLine();
                    } else {
                        return null;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    /**
     * Iterates through each line
     *
     * @param action The action to be performed for each element
     */
    @Override
    public void forEach(Consumer<? super String> action) {
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                action.accept(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
