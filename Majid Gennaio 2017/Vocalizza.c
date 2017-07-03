/*
 ============================================================================
 Name        : Vocalizza.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
char RESULT[] = "";

void vocalizza_for(char s[], int n) {
	int cont = 0;
	for (int i = 0; i < n; i++) {
		if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o'
				|| s[i] == 'u') {
			RESULT[cont++] = s[i];
		}
	}

}

char* vocalizza_RicTail(char s[], int n, int i, int j) {

	if (i == n)
		return "";
	else {
		if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o'
				|| s[i] == 'u') {
			RESULT[j] = s[i];
			j++;
		}
	}
	return vocalizza_RicTail(s, n, i + 1, j);
}

char* vocalizza_Ric(char s[], int n, int i, int j) {

	if (i == n)
		return "";
	else {
		if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o'
				|| s[i] == 'u') {
			RESULT[j] = s[i];
			return s[i] + vocalizza_Ric(s, n, i + 1, j + 1);
		} else
			return vocalizza_Ric(s, n, i + 1, j);
	}

}

int main(void) {

	char s[] = "angelo";
	vocalizza_for(s, sizeof(s) / sizeof(char));
	printf("prova: %s\n", RESULT);

	vocalizza_RicTail(s, sizeof(s) / sizeof(char), 0, 0);
	printf("prova: %s\n", RESULT);

	vocalizza_Ric(s, sizeof(s) / sizeof(char), 0, 0);
	printf("prova: %s\n", RESULT);

	printf("%d", (25 % 24) + 70 / 60);

	return EXIT_SUCCESS;
}
