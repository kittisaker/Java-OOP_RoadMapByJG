public class FinalizeExample {
    public static class MyResource {
        // Constructor
        public MyResource() {
            System.out.println("Resource acquired.");
        }

        // Cleanup method
        public void close() {
            System.out.println("Resource closed.");
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                close(); // Perform cleanup
            } finally {
                super.finalize();
            }
        }
    }

    public static void main(String[] args) {
        MyResource resource = new MyResource();

        // Simulate the object becoming unreachable and eligible for garbage collection
        resource = null;

        // Suggesting garbage collection (for demonstration purposes)
        System.gc();

        // Give some time for the finalization to occur
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Output: 
// Note: FinalizeExample.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Resource acquired.
// Resource closed.