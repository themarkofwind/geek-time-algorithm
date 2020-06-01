#递归模板伪码



```java
    // 递归模板
    public void recur(int level, int param) {

        // terminator
        if (level > MAX_LEVEL) {
            // process result
            return;
        }

        // process current level
        process(level, param);

        // drill down
        recur(level + 1, newParam);

        // restore current status
    }
```

