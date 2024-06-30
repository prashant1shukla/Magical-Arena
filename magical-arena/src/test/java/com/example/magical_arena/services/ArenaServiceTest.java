//package com.example.magical_arena.services;
//
//import com.example.magical_arena.models.Match;
//import com.example.magical_arena.models.Player;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Random;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class ArenaServiceTest {
//    private ArenaService arenaService;
//
//    @Mock
//    private Random random;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        arenaService = new ArenaService(random);
//    }
//
//    @Test
//    public void testStartMatch_Player1Wins() {
//        // Arrange
//        Player player1 = new Player(100, 10, 5);
//        Player player2 = new Player(50, 8, 4);
//        Match match = new Match(player1, player2);
//
//        // Mocking random values
//        when(random.nextInt(6)).thenReturn(3); // Mocking dice roll for deterministic test
//
//        // Act
//        String result = arenaService.startMatch(player1, player2);
//
//        // Assert
//        assertEquals("The winner is: Player 1", result);
//    }
//
//    @Test
//    public void testStartMatch_Player2Wins() {
//        // Arrange
//        Player player1 = new Player(50, 8, 4);
//        Player player2 = new Player(100, 10, 5);
//        Match match = new Match(player1, player2);
//
//        // Mocking random values
//        when(random.nextInt(6)).thenReturn(3); // Mocking dice roll for deterministic test
//
//        // Act
//        String result = arenaService.startMatch(player1, player2);
//
//        // Assert
//        assertEquals("The winner is: Player 2", result);
//    }
//}
