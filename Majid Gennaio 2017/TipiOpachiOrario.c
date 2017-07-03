/*
 ============================================================================
 Name        : TipiOpachiOrario.c
 Author      : Majid
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include "TipiOpachiOrario.h"
#include <stdio.h>
#include <stdlib.h>

struct orario {
	int hour;
	int minute;
	int second;
};

orarioRef createOrario(int h, int m, int s) {

	orarioRef ris = malloc(sizeof(struct orario));
	if (h > 24 || m > 60 || s > 60) {
		ris->second = s % 60;
		ris->minute = (m + s / 60) % 60;
		ris->hour = (h % 24) + m / 60;
	} else {
		ris->second = s;
		ris->minute = m;
		ris->hour = h;
	}
	return ris;
}

char* ToString(orarioRef o) {
	char temp[10];
	char* r = (char*) malloc(2 * sizeof(char) + 3 * sizeof(char) * 2);

	char z1;
	if (o->hour < 10)
		z1 = '0';
	else
		z1 = "";
	sprintf(temp, "%c%d:%c%d:%c%d", z1, o->hour, z1, o->minute, z1, o->second);
	return strcpy(r, temp);
}

orarioRef orarioInFuso(int x, orarioRef o) {
	o->hour += x;
	createOrario(o->hour, o->minute, o->second);
	return o;
}

int main(void) {
	orarioRef r = createOrario(24, 120, 120);
	printf("Prova creazione orario: %s\n", ToString(r));
	orarioRef a = orarioInFuso(1, r);
	printf("Prova cambio fuso orario: %s\n", ToString(a));
	orarioRef r1 = createOrario(1, 1, 1);
	printf("Prova cambio fuso orario: %s\n", ToString(r1));
//	printf("%d\n", a->hour);
//	printf("%d\n", a->minute);
//	printf("%d\n", a->second);
//	printf("prova    %d:%d:%d", a->hour, a->minute, a->second);
	orarioRef a1 = createOrario(14, 01, 30);
	/*char* prova = ToString(a1);
	 printf("%s", prova);*/
	printf("Prova uso ToString: %s\n", ToString(a1));

	return EXIT_SUCCESS;
}
