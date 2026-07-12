def compute_lps(pattern):
    # This is your exact LPS code, just with comments added.
    lps = [0] * len(pattern)
    length = 0
    i = 1

    while i < len(pattern):
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                length = lps[length - 1]
            else:
                lps[i] = 0
                i += 1
    return lps


def kmp_search(text, pattern):
    lps = compute_lps(pattern)

    # Meaningful names instead of i and j
    text_ptr = 0  # Points to where we are in the TEXT
    pattern_ptr = 0  # Points to where we are in the PATTERN
    found = False

    while text_ptr < len(text):
        # SCENARIO 1: The letters match!
        if text[text_ptr] == pattern[pattern_ptr]:
            text_ptr += 1  # Move text pointer forward
            pattern_ptr += 1  # Move pattern pointer forward

        # SCENARIO 2: We matched the entire pattern! (Jackpot)
        if pattern_ptr == len(pattern):
            # Calculate the starting index of the match and print it
            start_index = text_ptr - pattern_ptr
            print(f"Pattern found starting at index: {start_index}")

            # Use LPS to safely shift the pattern and keep looking for more matches
            pattern_ptr = lps[pattern_ptr - 1]
            found = True

        # SCENARIO 3: Mismatch! The letters don't match.
        elif text_ptr < len(text) and text[text_ptr] != pattern[pattern_ptr]:

            if pattern_ptr != 0:
                # KMP MAGIC: We have some matches. Look at the LPS cheat sheet
                # to see how far back we need to shift the pattern pointer.
                # Notice we DO NOT move the text_ptr backwards!
                pattern_ptr = lps[pattern_ptr - 1]
            else:
                # We are at the very first letter of the pattern and it's a mismatch.
                # Nothing to fall back on. Just move the text pointer forward.
                text_ptr += 1

    if not found:
        print("Pattern Not Found")


# Example Usage
text = input("Enter the text: ").strip()
pattern = input("Enter the pattern to find: ").strip()
kmp_search(text, pattern)