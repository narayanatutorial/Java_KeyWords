Volatile Keyword can be used for variables only and not applicable for methods and class.

# 1 Volatile

When we declared variable as  volatile then that variable value will be updated into main memory instead in cache. So whenver  multiple 
threads accessing the same variable then will get the latest value from the main memory.

Each thread will fetch the variable value from main memory instead cache

# **bold** Example Program Output

[Thread T0]: Old value = 0
[Thread T0]: New value = 1
[Thread T2]: Old value = 1
[Thread T2]: New value = 2
[Thread T1]: Old value = 1
[Thread T1]: New value = 3
[Thread T3]: Old value = 3
[Thread T3]: New value = 4
[Thread T4]: Old value = 4
[Thread T4]: New value = 5
